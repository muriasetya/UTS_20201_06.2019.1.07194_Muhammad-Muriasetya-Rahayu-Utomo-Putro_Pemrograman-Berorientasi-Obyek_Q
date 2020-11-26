package Entity;
public class DataPenggunaEntity {
    String email,nama,password,jeniskelamin;
public DataPenggunaEntity(String email, String nama, String password, String jeniskelamin) {
        this.email = email;
        this.nama = nama;
        this.password = password;
        this.jeniskelamin = jeniskelamin;
    }

    public DataPenggunaEntity() {
    }
    
    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

   
      
    
}
