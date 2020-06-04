package com.bangmaple.bangmaplenhentaihelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Font;
import mdlaf.themes.MaterialLiteTheme;

/**
 *
 * @author bangmaple
 */
public class MaterialLookAndFeelKanjiHelper extends MaterialLiteTheme {

    @Override
    protected void installFonts() {
        this.fontBold = new javax.swing.plaf.FontUIResource(Font.SANS_SERIF, Font.BOLD,14);
        this.fontItalic = new javax.swing.plaf.FontUIResource(Font.SANS_SERIF, Font.ITALIC,14);
        this.fontMedium = new javax.swing.plaf.FontUIResource(Font.SANS_SERIF, Font.PLAIN,14);
        this.fontRegular = new javax.swing.plaf.FontUIResource(Font.SANS_SERIF, Font.PLAIN,14);
    }
    
}
