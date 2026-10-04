package com.mycompany.minpro3;

import controller.PantiService;
import view.PantiView;
import java.util.Scanner;

public final class Minpro3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        PantiService service = new PantiService(scanner);
        
        PantiView view = new PantiView(service, scanner);
        
        view.tampilkanMenuUtama();
        
        scanner.close();
    }
}

