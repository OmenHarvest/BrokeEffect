package me.harvest.brokeEffect.events;

import me.harvest.brokeEffect.BrokeEffect;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class Events implements Listener {

    @EventHandler
    public void onPlayerHasDamage(EntityDamageEvent event) {
        if(event.getEntity() instanceof Player && event.getCause() == EntityDamageEvent.DamageCause.FALL) {
            Player player = (Player) event.getEntity();
            Random random = new Random();
            if(random.nextInt(100) < BrokeEffect.getInstance().getConfig().getInt("drop_effect")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 200, 2));
            }
        }
    }

}
