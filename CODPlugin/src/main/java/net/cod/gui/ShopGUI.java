package net.cod.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ShopGUI {

    public static ItemStack connect,next,nul;
    static ItemMeta con_meta,next_meta,nul_meta;
    static {
        connect = new ItemStack(Material.DIAMOND_AXE);
        next = new ItemStack(Material.DIAMOND_SWORD);
        nul = new ItemStack(Material.STAINED_GLASS_PANE);

        con_meta = connect.getItemMeta();
        con_meta.setDisplayName(ChatColor.GOLD+"Back[上一页]");
        con_meta.addEnchant(Enchantment.ARROW_FIRE,1,false);
        next_meta.setLore(new ArrayList<>());
        connect.setItemMeta(con_meta);

        next_meta = next.getItemMeta();
        next_meta.setDisplayName(ChatColor.GREEN+"Next[下一页]");
        next_meta.addEnchant(Enchantment.ARROW_FIRE,1,false);
        next_meta.setLore(new ArrayList<>());
        next.setItemMeta(next_meta);
    }

    public static void open(Player player,String name){
        switch (name){
            case "shop":shop(player);break;
        }
    }

    public static void shop(Player player){
        String title = ChatColor.GREEN+""+ChatColor.BOLD+"["+ChatColor.AQUA+""+ChatColor.BOLD+""+"称号商店"+ChatColor.GREEN+""+ChatColor.BOLD+"]";
        Inventory shop = Bukkit.createInventory(null,6*9,title);

        ItemStack[][] pane = {{nul,nul,nul,connect,nul,next,nul,nul,nul}};

        for(int i = 0; i < pane.length; i++){
            for(int j = 0; j < pane[i].length; j++){
                shop.setItem((i+1)*j,pane[i][j]);
            }
        }
        player.openInventory(shop);
    }
}
