package com.l2jbr.gameserver.model.database;

import com.l2jbr.commons.database.annotation.Column;
import com.l2jbr.commons.database.annotation.Table;

import java.util.Set;

@Table("merchant_shopids")
public class MerchantShopIds  {
    @Column("shop_id")
    private int shopId;
    @Column("npc_id")
    private String npcId;
    @Column("shop_id")
    private Set<MerchantBuyList> buyLists;

    public int getShopId() {
        return shopId;
    }

    public String getNpcId() {
        return npcId;
    }

    public Set<MerchantBuyList> getBuyLists() {
        return buyLists;
    }
}