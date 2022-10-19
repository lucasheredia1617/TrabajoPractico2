public class Main {
    public static void main(String[] args) {
        try {
            EpicDoubleHashMap.addItem();
        } catch (ExistentKeyException e) {
            System.out.println("Estas tratando de añadir un item con una key ya existente");
        }

        try{
            EpicDoubleHashMap.deleteKey();
        } catch (DeleteKeyException e){
            System.out.println("No se ha podido eliminar este item porque su key no existe");
        }

        try{
            EpicDoubleHashMap.addItemThreeTimes();
        } catch (AddItemException e){
            System.out.println("Este item ya se repite 3 veces");
        }

        try {
            EpicDoubleHashMap.getValue();
        } catch (GetValueException e){
            System.out.println("No se ha podido obtener el valor de: "+"porque su key no existe");
        }
    }
}
