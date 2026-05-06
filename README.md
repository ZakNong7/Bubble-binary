Bubble Sort
Jenis ​algoritma ini bekerja dengan membandingkan dua elemen terdekat secara berulang dan menukarnya jika urutannya salah. Elemen terbesar akan berpindah ke posisi akhir pada setiap array.

Untuk optimasi Bubble sort, bisa menambahkan flag atau ketentuan untuk berhenti jika tidak ada pertukaran posisi yang terjadi atau array sudah terurutkan

​Binary Insertion Sort
Binary insertion sort merupakan algortima yang melakukan pencarian terhadap biner (0 & 1) untuk mencari posisi yang pas sehingga array bisa terurutkan

Untuk optimasi binary insertion sort, cukup menggunakan binary insertions sort dalam jumlah array yang kecil. Jika jumlah arraynya besar, bisa mengganti ke algoritma sorting yang lebih mumpuni
Contoh:
public static void main(String[] args) {
int[] data = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Array: " + java.util.Arrays.toString(data));

    // Panggil salah satu metode
    bubbleSort(data);

    System.out.println("Sorted Array: " + java.util.Arrays.toString(data));

}
