import java.util.List;
import java.util.HashSet;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        if (cards == null || cards.isEmpty()) {
            return Set.of();
        }
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return Set.of();
        }
        Set<String> common = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            common.retainAll(collections.get(i));
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return Set.of();
        }
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
    }
}
