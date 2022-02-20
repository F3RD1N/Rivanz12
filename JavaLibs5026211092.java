import javax.swing.*;
public class JavaLibs5026211092 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hallo Semuanya");
        String nama= JOptionPane.showInputDialog("Nama kamu siapa?");
        JOptionPane.showMessageDialog(null,"Hallo " +nama);

        String tinggi= JOptionPane.showInputDialog("tinggi kamu berapa cm si?");
        int ting = Integer.parseInt(tinggi);
        JOptionPane.showMessageDialog(null,"wow tinggi banget ya, kalo tinggi kita di tambah jadi " +(ting+179)+" cm") ;

        String umur= JOptionPane.showInputDialog("umur kamu berapa sih?");
        if (umur.equalsIgnoreCase("19")){
            JOptionPane.showMessageDialog(null,"umur kita sama ya ternyata");
        } else {
            JOptionPane.showMessageDialog(null,"wah ternyata kita ga seangkatan :(");
        }
        String gender= JOptionPane.showInputDialog("kamu cewe apa cowo? (cewe atau cowo)");
        if (gender.equalsIgnoreCase("cewe")){
            JOptionPane.showMessageDialog(null,"wah kamu ternyata cewe");
        } else {
            JOptionPane.showMessageDialog(null,"oh ternyata kamu cowo?");
        }
        String pacar= JOptionPane.showInputDialog("kamu punya pacar ya?");
        if (pacar.equalsIgnoreCase("punya")){
            JOptionPane.showMessageDialog(null,"wah kamu pasti boong muka kek gitu kok punya");
        } else {
            JOptionPane.showMessageDialog(null,"wah kamu kasian banget ya");
        }
        String mantan= JOptionPane.showInputDialog("kamu punya mantan berapa?");
        int mantanconvert = Integer.parseInt(mantan);

        if (mantanconvert > 3) {
            JOptionPane.showMessageDialog(null,"kamu boong lagi kan masa kamu punya mantan banyak banget");
        } else if (mantanconvert <= 3) {
            JOptionPane.showMessageDialog(null,"oh ternyata mantan kamu sedikit ya");
        }
        String lahir= JOptionPane.showInputDialog("kamu lahir kapan?");
        JOptionPane.showMessageDialog(null,"oh kamu lahir di tanggal "+lahir);

        String kota= JOptionPane.showInputDialog("trus kamu asal mana?");
        JOptionPane.showMessageDialog(null,"oh kamu asal "+kota);

        String pertanyaan= JOptionPane.showInputDialog("kamu kuliah dimana?");
        if (pertanyaan.equalsIgnoreCase("ITS")){
            JOptionPane.showMessageDialog(null,"waduh anak ITS ni sama dong");
        } else {
            JOptionPane.showMessageDialog(null,"wah jelek bagusan ITS");
        }
        JOptionPane.showMessageDialog(null,"sudah cukup ya basa basinya sekarang kamu aku kasi pertayaan ok?");
        String terakhir= JOptionPane.showInputDialog("berapa 1.8+3.3");
        double ter= Double.parseDouble(terakhir);
        if (ter==5.4){
            JOptionPane.showMessageDialog(null,"kamu pinter sekali ya ternyata");
        } else {
            JOptionPane.showMessageDialog(null,"tetot kamu salah, belajar lagi ya");
        }
        JOptionPane.showMessageDialog(null,"apa ya udah itu aja sih babayyy");
        JOptionPane.showMessageDialog(null,"created by F3RD1N");




    }
}