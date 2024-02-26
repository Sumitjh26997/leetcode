class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> cities = new HashSet<>();

        for(List<String> cityPath : paths) {
            cities.add(cityPath.get(0));
        }

        for(List<String> cityPath : paths) {
            if(!cities.contains(cityPath.get(1))) {
                return cityPath.get(1);
            }
        }

        return "";
    }
}