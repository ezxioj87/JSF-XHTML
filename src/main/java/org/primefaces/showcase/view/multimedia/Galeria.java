

package org.primefaces.showcase.view.multimedia;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class Galeria {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            images.add("indice" + i + ".jpg");
        }

    }
 
    public List<String> getImages() {
        return images;
    }
}
