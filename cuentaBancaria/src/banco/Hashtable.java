/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author davidromeroayala
 * @version 1.69
 */
public class Hashtable {

    private Integer num;
    private String h;

    public Hashtable(Integer num, String h) {
        this.num = num;
        this.h = h;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

}
