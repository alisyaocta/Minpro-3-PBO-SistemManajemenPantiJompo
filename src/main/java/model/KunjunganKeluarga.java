package model;

public interface KunjunganKeluarga {
    void prosesKunjungan(String namaPengunjung, String hari, String jam);

    int getDurasiKunjunganMenit();

    default String hitungJamSelesai(String jam) {
        String[] bagian = jam.split(":");
        int totalMenit = Integer.parseInt(bagian[0]) * 60
                + Integer.parseInt(bagian[1])
                + getDurasiKunjunganMenit();
        totalMenit %= 24 * 60;
        return String.format("%02d:%02d", totalMenit / 60, totalMenit % 60);
    }
}