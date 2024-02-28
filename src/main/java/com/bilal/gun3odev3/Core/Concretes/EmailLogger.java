package com.bilal.gun3odev3.Core.Concretes;

import com.bilal.gun3odev3.Core.Abstracts.Logger;

public class EmailLogger implements Logger {
    public void log(String data) {
        System.out.println("Email ile loglanıyor : " + data);
    }
}
