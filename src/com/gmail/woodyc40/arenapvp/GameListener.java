package com.gmail.woodyc40.arenapvp;

//imports

public class GameListener implements Listener{

  List<String> players = new List<String>();
  ArenaPVP plugin;
  
  public GameListener(ArenaPVP plugin){
  	this.plugin = plugin;
  }
  
  @EventHandler
  public void onDamange(EntityDamageByEntityEvent e){
    
  }
  
  @EventHandler
  public void onDeath(PlayerDeathEvent e){
    
  }
  
  public static void add(Player p){
    final String anme = p.getName();
    players.add(name);
    
    Bukkit.getScheduler().scheduleSyncDelayeddTask(plugin, new Runnable(){
      @Override
      public void run(){
        players.remove(name); 
      }
    }, 100L);  
  }

}
