public class Utils {

    /**
     * Returns a copy of the array 'in' where each word occurring in the array
     * 'what' has been replaced by the word occurring in the same position
     * in the array 'with'.
     *
     * @param in   an array of Strings;
     * @param what an array of words to be replaced;
     * @param with an array of replacement words;
     * @return a new array idententical to 'in' except that all the occurrences of
     *         words
     *         found in 'what' have been replaced by the corresponding word from
     *         'with'.
     */

    public static String[] findAndReplace(String[] in, String[] what, String[] with) {
        // in is array given
        // what is word to be replaced
        // with is the replacement
        String[] empty = null;

        if (in == null || what == null || with == null) {
            return empty;
        }

        if (in != null && what != null && with != null) {
            if (with.length == what.length) {
                String[] out = new String[in.length];

                for (int i = 0; i < in.length; i++) {
                    out[i] = in[i];
                }

                for (int i = 0; i < what.length; i++) {
                    for (int j = 0; j < out.length; j++) {
                        if (what[i].equals(out[j])) {
                            out[j] = with[i];
                        }
                    }
                }

                return out;
            }
        }

        return null;
    }
}