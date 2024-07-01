public class latihanmeet3 {
    public static void main(String[] args){
        var absen = 70;
        var nilaiAkhir = 80;

        var LulusAbsen = absen >= 75;
        var LulusNilaiAkhir= nilaiAkhir >= 75;

        var lulus = LulusAbsen && LulusNilaiAkhir;

        if ( lulus == false){
            System.out.println("absen =" + absen);
            System.out.println("Nilai akhir =" + nilaiAkhir);
            System.out.println("maaf anda belum lulus");
        } else {
            System.out.println("absen =" + absen);
            System.out.println("Nilai akhir =" + nilaiAkhir);
            System.out.println("maaf anda belum lulus");
        }
        System.out.println(lulus);

        sayHelloWorld();
    }

    static void sayHelloWorld(){
        System.out.println("Hello world");
    }
}
