//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Productos> productos=new ArrayList<>();

    public static void main(String[] args) {
        excelReader();

    }


    public static void excelReader(){
        String nombre = "EvaSession12\\src\\Archivos\\ExcelEva12.xlsx";
        try {
            FileInputStream file = new FileInputStream(nombre);




        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}