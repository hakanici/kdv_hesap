package patikaStore;

import java.util.ArrayList;
import java.util.Optional;

public class Notebook extends Product{
    private static int nId=1;
    private static ArrayList<Notebook> notebooks=new ArrayList<>();


    public Notebook(String name, double price, int discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {

        super(nId,name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    }

    public Notebook(){

    }

    @Override
    public void menu() {

        System.out.println("1- Yeni Notebook ekle\n" +
                "2- Notebook listesini görüntüle\n" +
                "3- Notebook sil\n" +
                "4- Notebookları id numaralarına göre sırala\n" +
                "5- Notebookları markaya göre filtrele");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int value=scanner.nextInt();
        if(value==1) addItem();
        if(value==2 || value==4) getProducts();
        if(value==3) deleteItem();
        if(value==5) brandFilter();

    }

    @Override
    public void addItem() {
        System.out.print("Ürünün fiyatı : ");
        double price= scanner.nextDouble();
        System.out.print("Ürünün adı : ");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.print("Ürünün indirim oranı : ");
        int discountRate= scanner.nextInt();
        System.out.print("Ürünün stoğu : ");
        int amount= scanner.nextInt();
        System.out.print("Ürünün RAM'i : ");
        int ram= scanner.nextInt();
        System.out.print("Ürünün ekran Boyutu : ");
        double screenSize= scanner.nextDouble();
        System.out.print("Ürünün hafızası(GB) :");
        int memory= scanner.nextInt();
        Brand.printBrands();
        System.out.print("Marka Seçiniz : ");
        Brand brand=Brand.getBrand(scanner.nextInt());
        Notebook notebook=new Notebook(name,price,discountRate,amount,brand,screenSize,ram,memory); //ürün oluşturuldu.
        this.notebooks.add(notebook);       //id verildi ve listeye eklendi.
        System.out.println("Eklenen notebook'un id'si :"+notebook.getId());
    }

    @Override
    public void getProducts() {
        print(null);

    }

    public void print(ArrayList<Notebook> notebookList){
        if(notebookList==null) notebookList=this.notebooks;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n:notebookList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory());
        }
    }

    @Override
    public void deleteItem(){
        getProducts();
        System.out.print("Silinmesini istediğiniz notebook'un Id numarasını giriniz : ");
        int id=scanner.nextInt();
        Optional<Notebook> stuff = notebooks.stream()
                .filter(x->x.getId()==id)
                .findFirst();
        System.out.println("Siliniyor...\nid: "+id);
        stuff.ifPresent(notebook->notebooks.remove(notebook));           //Listede tutulan id numarasına göre listeden silinir.
        System.out.println("Güncel notebook listesi ");
        getProducts();
    }

    private void brandFilter() {
        scanner.nextLine();
        System.out.print("Filtrelemek istediğiniz ürün markasını giriniz :");
        String filter= scanner.nextLine();                          //Ürün ismi alınır
        ArrayList<Notebook> filterNotebooks=new ArrayList<>();      //Boş bir liste oluşturulur.
        for (Notebook n:notebooks){                                 //Notebook listesi dönülür.
            if(filter.equals(n.getBrand().getName())){              //Girilen string ile listedeki eşitse
                filterNotebooks.add(n);                              //boş listeye ürünler bütün özellikler ile birlikte eklenir.
            }
        }
        print(filterNotebooks);         //Girilen ürün markasının bütün ürünleri özellikleriyle listelenir.
    }

    public static int getnId() {
        return nId;
    }
}
