package pojobeans;

/**
 * Created by tuananh on 05/31/17.
 */
public interface AccountService {
    void transferMoney(long fromAccountId, long toAccountId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
