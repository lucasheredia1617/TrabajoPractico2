public class Main {
	public static void main(String[] args) {
        EpicDoubleHashMap<Integer, Integer, String> map = new EpicDoubleHashMap<>();
        map.addFirstType(5, "Hola");
        map.addSecondType(6, "Chau");
        map.addThirdType(7, 6, "Hola");
    }
}
