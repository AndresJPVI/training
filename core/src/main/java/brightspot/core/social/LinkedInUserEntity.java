package brightspot.core.social;

import com.psddev.cms.db.Interchangeable;
import com.psddev.dari.db.Recordable;

/**
 * A type of {@link LinkedInEntity} that represenst a user.
 */
@Recordable.DisplayName("User")
public class LinkedInUserEntity extends LinkedInEntity implements Interchangeable {

    @Override
    public String getBaseUrl() {
        return "https://www.linkedin.com/in/";
    }

    @Override
    public boolean loadTo(Object newObject) {
        if (newObject instanceof LinkedInCompanyEntity) {
            ((LinkedInCompanyEntity) newObject).setLinkedInUsername(this.getLinkedInUsername());
            return true;
        }
        return false;
    }
}
