package hust.soict.itep.aims.media;

import java.util.Comparator;
public class MediaComparatorByCostTitle implements Comparator<Media>
{
    public MediaComparatorByCostTitle() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compare(Media m1, Media m2) {
        if(m1.getCost() != m2.getCost()) {
            return Float.compare(m1.getCost(), m2.getCost());
        }
        return m1.getTitle().compareTo(m2.getTitle());
    }

}