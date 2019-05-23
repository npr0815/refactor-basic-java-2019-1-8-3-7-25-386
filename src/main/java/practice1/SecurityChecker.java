package practice1;

import com.google.common.collect.ImmutableList;

public class SecurityChecker {
    private ImmutableList<Permission> permissions;

    public boolean checkPermission(User user, Permission permission) {
        if (permission != null)
            //permissions = ImmutableList.<Permission>builder().add(permission).build();
            return true;
        return false;
    }

    public boolean isAdmin() {
        //todo code
        return false;
    }
}
