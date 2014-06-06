package org.keycloak.models;

import org.keycloak.provider.Provider;

import java.util.List;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface KeycloakSession extends Provider {
    KeycloakTransaction getTransaction();

    RealmModel createRealm(String name);
    RealmModel createRealm(String id, String name);
    RealmModel getRealm(String id);
    RealmModel getRealmByName(String name);
    UserModel getUserById(String id, String realmId);
    UserModel getUserByUsername(String username, String realmId);
    UserModel getUserByEmail(String email, String realmId);
    List<RealmModel> getRealms();
    boolean removeRealm(String id);

    void removeAllData();

    void close();
}
