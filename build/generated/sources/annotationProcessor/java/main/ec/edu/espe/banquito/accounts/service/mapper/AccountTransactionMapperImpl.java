package ec.edu.espe.banquito.accounts.service.mapper;

import ec.edu.espe.banquito.accounts.controller.res.AccountTransactionResDto;
import ec.edu.espe.banquito.accounts.model.AccountTransaction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-27T18:40:27-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AccountTransactionMapperImpl implements AccountTransactionMapper {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<AccountTransactionResDto> toRes(List<AccountTransaction> accountTransactions) {
        if ( accountTransactions == null ) {
            return null;
        }

        List<AccountTransactionResDto> list = new ArrayList<AccountTransactionResDto>( accountTransactions.size() );
        for ( AccountTransaction accountTransaction : accountTransactions ) {
            list.add( toRes( accountTransaction ) );
        }

        return list;
    }

    @Override
    public AccountTransactionResDto toRes(AccountTransaction accountTransaction) {
        if ( accountTransaction == null ) {
            return null;
        }

        AccountTransactionResDto.AccountTransactionResDtoBuilder accountTransactionResDto = AccountTransactionResDto.builder();

        accountTransactionResDto.id( accountTransaction.getId() );
        accountTransactionResDto.uniqueKey( accountTransaction.getUniqueKey() );
        if ( accountTransaction.getTransactionType() != null ) {
            accountTransactionResDto.transactionType( accountTransaction.getTransactionType().name() );
        }
        accountTransactionResDto.reference( accountTransaction.getReference() );
        accountTransactionResDto.ammount( accountTransaction.getAmmount() );
        accountTransactionResDto.balanceAfterTransaction( accountTransaction.getBalanceAfterTransaction() );
        accountTransactionResDto.creditorBankCode( accountTransaction.getCreditorBankCode() );
        accountTransactionResDto.creditorAccount( accountTransaction.getCreditorAccount() );
        accountTransactionResDto.debtorBankCode( accountTransaction.getDebtorBankCode() );
        accountTransactionResDto.debtorAccount( accountTransaction.getDebtorAccount() );
        accountTransactionResDto.creationDate( accountTransaction.getCreationDate() );
        accountTransactionResDto.bookingDate( accountTransaction.getBookingDate() );
        accountTransactionResDto.valueDate( accountTransaction.getValueDate() );
        accountTransactionResDto.applyTax( accountTransaction.getApplyTax() );
        if ( accountTransaction.getState() != null ) {
            accountTransactionResDto.state( accountTransaction.getState().name() );
        }
        accountTransactionResDto.notes( accountTransaction.getNotes() );
        accountTransactionResDto.account( accountMapper.toRes( accountTransaction.getAccount() ) );

        return accountTransactionResDto.build();
    }
}
