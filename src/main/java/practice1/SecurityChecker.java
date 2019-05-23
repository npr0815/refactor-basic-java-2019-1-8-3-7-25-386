package practice1;

import com.google.common.collect.ImmutableList;

public class SecurityChecker {
    private ImmutableList<Permission> permissions;
    private  User user;

    public boolean checkPermission(User user, Permission permission) {
        if (permissions.size() != 0 && !permissions.contains(permission))
            return true;

        return false;
    }

    public boolean isAdmin() {
        if (user.getAdmin() == false)
            return false;

        return true;
    }
}
