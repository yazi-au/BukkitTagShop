package net.cod.Util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI {
    public static ArrayList<String> prefix = new ArrayList<>();
    public static Inventory init(String title){
        Inventory GUI = Bukkit.createInventory(null,6*9,title);
         ItemStack next = new ItemStack(Material.ARROW);
         ItemMeta nextMeta = next.getItemMeta();
         nextMeta.setDisplayName(ChatColor.AQUA + "[下一页]");
         ItemStack back = new ItemStack(Material.ARROW);
         ItemMeta backMeta = back.getItemMeta();
         backMeta.setDisplayName(ChatColor.AQUA + "[上一页]");
         ItemStack background = new ItemStack(Material.THIN_GLASS);
         for (int i = 45; i < 54; i++) {
             GUI.setItem(i,background);
         }
         GUI.setItem(48,back);
         GUI.setItem(50,next);
         return GUI;
    }

    public static Inventory updatePrefix(int page){
        int length = prefix.size();int i;
        Inventory pageGUI = init("[称号商城] - 第"+page+"页");
        int num = 0;
        for (;;) {
            if(num >= 44 || prefix.size() <= num){
                return pageGUI;
            }
            ItemStack item = new ItemStack(Material.NAME_TAG);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(prefix.get(page * 45 + num));
            pageGUI.setItem(num,item);
            num++;
        }
    }
}
