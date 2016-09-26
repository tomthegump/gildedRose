package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void gildedRose() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("+5 Dexterity Vest, 9, 19", app.items[0].toString());
        assertEquals("Aged Brie, 1, 1", app.items[1].toString());
        assertEquals("Elixir of the Mongoose, 4, 6",app.items[2].toString());
        assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", app.items[3].toString());
        assertEquals("Sulfuras, Hand of Ragnaros, -1, 80", app.items[4].toString());
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 21", app.items[5].toString());
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", app.items[6].toString());
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", app.items[7].toString());
    }

}
