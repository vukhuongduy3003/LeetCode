class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (Integer n : hand) {
            tree.put(n, tree.getOrDefault(n, 0) + 1);
        }
        while (!tree.isEmpty()) {
            int first = tree.firstKey();
            for (int i = first; i < first + groupSize; i++) {
                if (!tree.containsKey(i)) {
                    return false;
                }
                tree.put(i, tree.get(i) - 1);
                if (tree.get(i) == 0) {
                    if (i != tree.firstKey()) {
                        return false;
                    }
                    tree.remove(i);
                }
            }
        }
        return true;
    }
}