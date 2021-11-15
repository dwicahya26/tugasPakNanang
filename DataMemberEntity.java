/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldgym;

/**
 *
 * @author LENOVO
 */
public abstract class DataMemberEntity {
    protected String nama, noMember; //modifier, deklarrrasi var string
    
    public DataMemberEntity(String nama, String noMember){ //konstruk class parameter string dengan atributnya untuk menyimpan nilai dan mengambil nilai
        this.nama = nama; //atribut dari parameter konstruk
        this.noMember = noMember;
    }
    
    public abstract String getNoMember();

    public void setNoMemberr(String noMember) {
        this.noMember = noMember;
    }
    
    public String getNama(){ //method get gunanya ngambil nilai 
        return nama;
    }
    public void setNama(String nama){ 
        this.nama = nama;
    }
}
