## 👥 **Soal 4 – “Profil Pengguna + Edit”**

### 📌 Deskripsi:

Buat aplikasi untuk menampilkan profil pengguna dan mengedit datanya secara fragment-based.

### 🧩 Requirement:

1. Gunakan **1 Activity** dan **4–5 Fragment**:

    - `LoginFragment`: input nama pengguna
    - `ProfileFragment`: menampilkan nama dan deskripsi
    - `EditNameFragment`: ubah nama
    - `EditDescFragment`: ubah deskripsi
    - `AboutFragment`: tentang aplikasi

2. Navigasi:

    - Setelah login → ke ProfileFragment
    - Tombol edit nama / deskripsi → pindah ke fragment edit masing-masing
    - Setelah diedit, kembali ke ProfileFragment dan data berubah

3. Data bisa disimpan di Activity atau lewat `setArguments`

### 🧱 Komponen:

- `EditText`, `TextView`, `Button`
- Navigasi + pengembalian data antar fragment
- Penggunaan kondisi (jika nama kosong, tidak bisa lanjut)

### 🎯 Tujuan:

- Navigasi dua arah + update data
- Fragment sebagai pengganti “form page”
- Simulasi aplikasi profil edit yang umum digunakan

---
