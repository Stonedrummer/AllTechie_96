package com.example.akshit.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static
    {
        addItem(new DummyItem("1","Pocketnow","http://pocketnow.com/"));
        addItem(new DummyItem("2","TechnoBuffalo","https://www.technobuffalo.com/"));
        addItem(new DummyItem("3","The Verge","https://www.theverge.com/"));
        addItem(new DummyItem("4","fonearena","http://www.fonearena.com/"));
        addItem(new DummyItem("5","phoneArena.com","http://www.phonearena.com/"));
        addItem(new DummyItem("6","iGyaan","http://www.igyaan.in/"));
        addItem(new DummyItem("7","Gadgets360","http://m.gadgets.ndtv.com/"));
        addItem(new DummyItem("8","TechCrunch","https://techcrunch.com/"));
        addItem(new DummyItem("9","GSMArena","http://m.gsmarena.com/"));
        addItem(new DummyItem("10","Digit","http://www.digit.in/"));
        addItem(new DummyItem("11","XDA","https://www.xda-developers.com/"));
        addItem(new DummyItem("12","CNET","https://www.cnet.com/"));
        addItem(new DummyItem("13","Engadget","https://www.engadget.com/"));
        addItem(new DummyItem("14","Technology | TED","https://www.ted.com/topics/technology"));
        addItem(new DummyItem("15","Android Authority","http://www.androidauthority.com/"));
        addItem(new DummyItem("16","Android Police","http://www.androidpolice.com/"));
        addItem(new DummyItem("17","Android Central","https://m.androidcentral.com/"));
        addItem(new DummyItem("18","Windows Central","https://m.windowscentral.com/"));
        addItem(new DummyItem("19","Droid Life","http://www.droid-life.com/"));
        addItem(new DummyItem("20","MSN","https://www.msn.com/en-us/news/technology"));
        addItem(new DummyItem("21","The Hindu(Tech)","http://www.thehindu.com/sci-tech/technology/"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String item_name;
        public final String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
