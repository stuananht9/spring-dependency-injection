package pojobeans;

import org.springframework.stereotype.Controller;

/**
 * Created by tuananh on 05/31/17.
 */

public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
