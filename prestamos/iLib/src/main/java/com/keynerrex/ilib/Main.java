package com.keynerrex.ilib;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

public class Main extends Dashboard {

    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();

        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }

}
