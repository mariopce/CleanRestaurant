package pl.saramak.restaurant.model.user;

import java.util.List;

/**
 * Created by mario on 23.11.16.
 */

public interface User {
    public String getLogin();
    public String getName();
    public List<Privilege> getPrivileges();
    public void grantPrivilege(Privilege privilege);
}
