# DOKUMENTASI MINI PROJECT 3
### PEMOGRAMAN BERORIENTASI OBJEK
### SISTEM MANAJEMEN PANTI JOMPO

Nama: Alisya Octa Noor Ghina

NIM: 2509116017

---

# BAB I PENDAHULUAN

## 1.1	Deskripsi Singkat

### Deskripsi Program

**Sistem Manajemen Panti Jompo Rumah Senja** merupakan program yang dirancang untuk membantu proses pengelolaan dan pendataan penghuni panti secara lebih terstruktur dan sistematis. Program ini memungkinkan pengguna untuk mengelola informasi penghuni melalui beberapa fitur yang telah disediakan.

Fitur utama yang tersedia dalam program meliputi **menambahkan data, menampilkan data, memperbarui data, menghapus data, dan mencari data penghuni**. Pada proses pembaruan data, pengguna dapat memperbarui informasi tertentu, seperti **usia dan kondisi penghuni**. Data umum yang dikelola meliputi **ID penghuni, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan**.

Dalam program ini, penghuni panti dibedakan menjadi dua kategori, yaitu **Penghuni Intensif** dan **Penghuni Mandiri**. Penghuni Intensif merupakan penghuni yang membutuhkan pemantauan dan perawatan lebih lanjut, sehingga memiliki informasi tambahan seperti **nama perawat, jadwal kontrol medis, dan jadwal pemberian obat**. Sementara itu, Penghuni Mandiri merupakan penghuni yang masih dapat melakukan aktivitas sehari-hari secara lebih mandiri dan memiliki informasi tambahan berupa **hobi serta kegiatan harian**.

Dalam pembuatannya, program ini menerapkan beberapa konsep **Object-Oriented Programming (OOP)**, yaitu **enkapsulasi, inheritance, dan polymorphism**. Selain itu, struktur program menggunakan pola **Model-View-Controller (MVC)** untuk memisahkan pengelolaan data, interaksi pengguna, dan pengendalian alur program. Penerapan konsep-konsep tersebut bertujuan agar program memiliki struktur yang lebih terorganisir serta memudahkan proses pengembangan dan pemeliharaan kode.


## 1.2	Tujuan

Sistem Manajemen Panti Jompo dirancang dengan tujuan sebagai berikut:

- Membantu mengelola data penghuni Panti Jompo Rumah Senja secara lebih terstruktur. 
- Mempermudah dalam melakukan proses penambahan, penampilan, pembaruan, penghapusan, dan pencarian data penghuni.

## 1.3  Alur Singkat

Alur program dimulai dengan menampilkan Menu Utama yang berisi beberapa pilihan untuk mengelola data penghuni. Pengguna dapat memilih menu sesuai dengan kebutuhan, yaitu menambahkan data, menampilkan data, memperbarui data, menghapus data, dan mencari data penghuni. Setelah pengguna memilih salah satu menu, sistem akan menjalankan proses sesuai dengan pilihan tersebut.

Pada proses penambahan, penampilan, dan update data, sistem dapat menampilkan pilihan berdasarkan kategori penghuni, yaitu Penghuni Mandiri dan Penghuni Intensif. Ketika menambahkan data, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan sesuai dengan kategori penghuni yang dipilih. Setiap input yang diberikan akan melalui proses validasi untuk memastikan data yang dimasukkan sesuai dengan ketentuan program.

Setelah proses selesai, sistem akan menampilkan hasil dari proses yang dilakukan, seperti data yang berhasil ditambahkan, ditampilkan, diperbarui, dihapus, atau ditemukan. Pengguna kemudian dapat kembali ke Menu Utama untuk melakukan pengelolaan data lainnya.

Program akan terus berjalan dan menerima pilihan dari pengguna hingga pengguna memilih menu Keluar. Setelah menu tersebut dipilih, program akan mengakhiri proses dan keluar dari sistem.

---

# BAB II ALUR PROGRAM

## 2.1 Menu Utama

<img width="373" height="222" alt="image" src="https://github.com/user-attachments/assets/869e47df-95b8-4812-bbb7-d9370e655f20" />

Gambar di atas menampilkan Menu Utama dari program Sistem Manajemen Panti Jompo Rumah Senja. Menu ini menjadi tampilan awal yang digunakan sebagai pusat navigasi bagi pengguna dalam mengelola data penghuni panti. Terdapat beberapa pilihan menu, yaitu Tambah Data untuk menambahkan data penghuni baru, Tampilkan Data untuk melihat data penghuni yang telah tersimpan, Hapus Data untuk menghapus data penghuni, Update Data untuk memperbarui informasi penghuni, Cari Data Penghuni untuk mencari data berdasarkan informasi tertentu, mencatat data para pengunjung panti, serta Keluar untuk mengakhiri program.

Pengguna dapat memilih menu sesuai dengan kebutuhan pengelolaan data melalui pilihan nomor yang tersedia. Dengan adanya Menu Utama ini, proses pengelolaan data penghuni dapat dilakukan secara lebih terstruktur dan mudah digunakan.

## 2.2 Menu Tambah

<img width="372" height="151" alt="image" src="https://github.com/user-attachments/assets/4b7ae8fe-1b8b-4b1c-ab45-b62708fd9450" />

Gambar di atas menampilkan Menu Tambah Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis penghuni yang ingin ditambahkan, yaitu Penghuni Intensif atau Penghuni Mandiri. Setiap jenis penghuni memiliki data yang perlu diinput sesuai dengan kategorinya. Setelah pengguna memilih jenis penghuni, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan, seperti ID, nama, usia, nomor telepon, jenis kelamin, serta kondisi penghuni. Dengan adanya pilihan tersebut, data penghuni dapat dikelompokkan berdasarkan jenisnya sehingga pengelolaan data menjadi lebih terstruktur.

### 2.2.1 Tambah Data Penghuni Mandiri

<img width="373" height="222" alt="image" src="https://github.com/user-attachments/assets/953266d0-acc7-4467-a8da-e34166e7d2ea" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Mandiri. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Mandiri, yaitu hobi dan kegiatan harian. Data tersebut digunakan untuk memberikan informasi yang lebih lengkap mengenai penghuni.

### 2.2.2 Tambah Data Penghuni Intensif

<img width="377" height="239" alt="image" src="https://github.com/user-attachments/assets/6d2bcd97-239d-4c51-9af6-bfb1a273b526" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Intensif. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Intensif, yaitu nama perawat, jadwal kontrol medis, dan jadwal pemberian obat. Informasi tambahan tersebut digunakan untuk mendukung pengelolaan dan pemantauan kebutuhan khusus penghuni intensif.

## 2.3 Menu Tampilkan

<img width="592" height="273" alt="image" src="https://github.com/user-attachments/assets/75427902-e45b-49a5-8324-47cd3aba0469" />

Gambar di atas menampilkan Menu Tampilkan Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis data yang ingin ditampilkan, yaitu seluruh data penghuni, data Penghuni Mandiri, atau data Penghuni Intensif. Pilihan tersebut memudahkan pengguna dalam melihat data sesuai dengan kebutuhan.

### 2.3.1 Tampilkan Seluruh Data Penghuni

<img width="379" height="435" alt="image" src="https://github.com/user-attachments/assets/6771e8f3-8f38-4ee7-b101-a0290fe545ab" />

<img width="374" height="392" alt="image" src="https://github.com/user-attachments/assets/95313aa7-9473-4085-8269-2ba19f542231" />

Gambar di atas menunjukkan seluruh data penghuni Panti Jompo Rumah Senja, yang terdiri dari Penghuni Mandiri dan Penghuni Intensif. Ketika pengguna memilih menu untuk menampilkan seluruh data, sistem akan menampilkan informasi dari kedua jenis penghuni tersebut.

### 2.3.2 Tampilkan Data Penghuni Intensif

<img width="375" height="456" alt="image" src="https://github.com/user-attachments/assets/381a85ee-7e8e-421e-b79d-9bd2a3454bd9" />

Gambar di atas menunjukkan data Penghuni Intensif. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Intensif, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

### 2.3.3 Tampilkan Data Penghuni Mandiri

<img width="378" height="427" alt="image" src="https://github.com/user-attachments/assets/b5949d6b-97ab-4f89-bb43-2022fa48048e" />

Gambar di atas menunjukkan data Penghuni Mandiri. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Mandiri, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

## 2.4 Menu Update

<img width="375" height="189" alt="image" src="https://github.com/user-attachments/assets/e9aaf726-aaa1-40db-8496-f91d7757019b" />

Pada menu Update Data, pengguna dapat memilih informasi yang ingin diperbarui. Sistem menyediakan empat pilihan informasi yang dapat diubah, yaitu Usia Penghuni, Kondisi Kesehatan Penghuni, Update Informasi Khusus Penghuni Intensif, dan Update Informasi Khusus Penghuni Mandiri. 

### 2.4.1 Update Umur Penghuni

<img width="392" height="169" alt="image" src="https://github.com/user-attachments/assets/c27dabe8-5c10-4626-a3a9-68874e48b821" />

Pada menu Update Usia, pengguna perlu memasukkan ID penghuni yang ingin diperbarui usianya. Setelah ID penghuni ditemukan, pengguna dapat memasukkan usia terbaru penghuni tersebut. Kemudian sistem akan memperbarui data usia sesuai dengan input yang diberikan.

### 2.4.2 Update Kondisi Penghuni

<img width="389" height="150" alt="image" src="https://github.com/user-attachments/assets/6b35a9da-4209-4a99-896a-63deedb487c5" />

<img width="381" height="235" alt="image" src="https://github.com/user-attachments/assets/1b6c6c53-1b2b-4b3c-8ba8-26d07946cd9c" />

### 2.4.3 Update Informasi Khusus Penghuni Intensif

<img width="384" height="183" alt="image" src="https://github.com/user-attachments/assets/14f54a72-b540-4bf5-ac42-74cea2e1c25c" />

<img width="382" height="106" alt="image" src="https://github.com/user-attachments/assets/557163c7-2238-4c02-a9ed-486bc40ae7b0" />

### 2.4.4 Update Informasi Khusus Penghuni Mandiri

<img width="388" height="172" alt="image" src="https://github.com/user-attachments/assets/1005ec6e-e637-4579-8c82-48a95938cb7a" />

<img width="388" height="98" alt="image" src="https://github.com/user-attachments/assets/ff5e6a94-b6e7-449b-9c32-0db154539734" />

## 2.5 Menu Hapus

<img width="372" height="105" alt="image" src="https://github.com/user-attachments/assets/f47acd73-988f-4b37-833c-8772dadcdae0" />

<img width="372" height="105" alt="image" src="https://github.com/user-attachments/assets/a6eaf2e0-ecba-46b5-a710-5c63f51f86c5" />

## 2.6 Menu Cari

<img width="373" height="290" alt="image" src="https://github.com/user-attachments/assets/2e6e2438-de08-496f-a9df-e1709ec07254" />

<img width="373" height="105" alt="image" src="https://github.com/user-attachments/assets/46cb3af3-ffb1-4067-8e62-63a54c1165c0" />

<img width="373" height="152" alt="image" src="https://github.com/user-attachments/assets/55f8349c-f76f-4767-9e5f-a9bc7e3243a3" />

## 2.7 Menu Kunjungan

<img width="446" height="307" alt="image" src="https://github.com/user-attachments/assets/1e293710-2a92-4fce-bbb8-04a7a319fb88" />

## 2.8 Menu Keluar

<img width="379" height="91" alt="image" src="https://github.com/user-attachments/assets/fce26b07-c0b1-403a-bf33-2f34ff406212" />

## 2.9 Validasi 

<img width="397" height="87" alt="image" src="https://github.com/user-attachments/assets/f6de5930-2e16-4f42-92ba-ead3140f38b4" />

<img width="377" height="84" alt="image" src="https://github.com/user-attachments/assets/eaa7f7e1-c0f7-48f5-af23-52cd40e0be92" />

<img width="375" height="53" alt="image" src="https://github.com/user-attachments/assets/2dd05a49-6f1a-4d67-8726-5f14f13ad6fb" />

<img width="377" height="86" alt="image" src="https://github.com/user-attachments/assets/9ff48006-10e0-4ac8-9802-359874c9c0bc" />

<img width="374" height="88" alt="image" src="https://github.com/user-attachments/assets/d5f875af-12fe-47f1-95df-049ff3100768" />

<img width="441" height="83" alt="image" src="https://github.com/user-attachments/assets/8e8cbf15-14e8-4190-9717-72b574318935" />

<img width="400" height="83" alt="image" src="https://github.com/user-attachments/assets/2b446dcb-e15d-4757-b38b-abf97cb10f00" />

---

# BAB III STRUKTUR PROGRAM

## 3.1 MVC

<img width="320" height="273" alt="image" src="https://github.com/user-attachments/assets/0dc246ae-32bb-464a-bcfd-b17b0ee625b3" />


## 3.2 Inheritance

<img width="547" height="180" alt="image" src="https://github.com/user-attachments/assets/82c1c009-1442-4233-9b51-645c89c9fdbf" />

Penggunaan Keyword Final

<img width="665" height="131" alt="image" src="https://github.com/user-attachments/assets/692dfd4d-0f86-4906-ba8a-e853e41196d8" />

<img width="658" height="118" alt="image" src="https://github.com/user-attachments/assets/1b85df97-69be-48e3-aaba-fc691ebea2a8" />

Penggunaan Keyword Extends

<img width="852" height="158" alt="image" src="https://github.com/user-attachments/assets/3dead879-1cf8-4d55-9fd1-30e32d56b9d0" />

<img width="668" height="141" alt="image" src="https://github.com/user-attachments/assets/8d508149-bc15-4730-b65c-2d82eb7fb87c" />

Penggunaan Keyword Super

## 3.3 Encapsulation

<img width="544" height="204" alt="image" src="https://github.com/user-attachments/assets/8f4093ed-7dcc-42dc-9bbb-13f157a68af9" />

<img width="646" height="204" alt="image" src="https://github.com/user-attachments/assets/7776224b-966f-4f86-b880-ce2b9f1da5bd" />

<img width="654" height="182" alt="image" src="https://github.com/user-attachments/assets/25f82de3-4565-42ec-8b93-cb45e59749f7" />

## 3.4 Constructor

<img width="601" height="185" alt="image" src="https://github.com/user-attachments/assets/2637d8ea-2890-4f2b-8677-8db478a6188c" />

<img width="852" height="158" alt="image" src="https://github.com/user-attachments/assets/3dead879-1cf8-4d55-9fd1-30e32d56b9d0" />

<img width="668" height="141" alt="image" src="https://github.com/user-attachments/assets/8d508149-bc15-4730-b65c-2d82eb7fb87c" />


## 3.5 Polymorphism

### 3.5.1 Overriding

<img width="543" height="157" alt="image" src="https://github.com/user-attachments/assets/0a14f35a-d32d-41dc-bdb5-96a4bbb48332" />

<img width="557" height="135" alt="image" src="https://github.com/user-attachments/assets/8438230e-4624-4de2-8e12-c9fa4c92840a" />

### 3.5.2 Overloading

<img width="719" height="562" alt="image" src="https://github.com/user-attachments/assets/27acf0c0-e8a5-44bd-90ff-40d64d69ed57" />

<img width="659" height="94" alt="image" src="https://github.com/user-attachments/assets/e0d352f6-9173-4202-bb42-7f4689f1fbd1" />

<img width="658" height="96" alt="image" src="https://github.com/user-attachments/assets/51c4441b-3c09-4d43-b263-cdb741d6981f" />


## 3.6 Abstraction

### 3.6.1 Abstract Class

<img width="527" height="64" alt="image" src="https://github.com/user-attachments/assets/42baeb3c-7cfb-43e9-b961-f095433d2eb7" />

### 3.6.2 Abstract Method

<img width="335" height="192" alt="image" src="https://github.com/user-attachments/assets/592560a2-c8bd-4baa-b345-8fb9c2a4ece4" />


## 3.7 Interface

<img width="515" height="108" alt="image" src="https://github.com/user-attachments/assets/5d274f34-19d6-46b8-9731-8e3682b7d766" />

<img width="665" height="131" alt="image" src="https://github.com/user-attachments/assets/692dfd4d-0f86-4906-ba8a-e853e41196d8" />

<img width="658" height="118" alt="image" src="https://github.com/user-attachments/assets/1b85df97-69be-48e3-aaba-fc691ebea2a8" />
