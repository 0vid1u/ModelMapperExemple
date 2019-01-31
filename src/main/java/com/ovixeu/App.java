package com.ovixeu;

import com.ovixeu.explicit.dto.TransactionDTO;
import com.ovixeu.explicit.entities.TransactionEntity;
import com.ovixeu.implicit.dto.PaymentDTO;
import com.ovixeu.implicit.entities.PaymentEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

public class App {
    public static void main(String[] args) {
        // Implicit mapping
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setId(1);
        paymentEntity.setPaymentNumber("some payment number");
        paymentEntity.setAmount(12.3);


        ModelMapper implicitMapper = new ModelMapper();
        PaymentDTO paymentDTO = implicitMapper.map(paymentEntity, PaymentDTO.class);

        System.out.println(paymentDTO);

        // Explicit mapping
        System.out.println("-----------------------------------");
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setTransactionId(2);
        transactionEntity.setTransactionCardType("Visa");
        transactionEntity.setTransactionAmount(213.23);

        ModelMapper explicitMapper = new ModelMapper();
        PropertyMap<TransactionDTO, TransactionEntity> orderMap = new PropertyMap <TransactionDTO, TransactionEntity>() {
            protected void configure() {
                map().setTransactionId(source.getId());
                map().setTransactionCardType(source.getCardType());
                map().setTransactionAmount(source.getAmount());
            }
        };
        explicitMapper.addMappings(orderMap);
        TransactionDTO transactionDTO = explicitMapper.map(transactionEntity, TransactionDTO.class);

        System.out.println(transactionDTO);

        // Explicit LOOSE strategy
        System.out.println("-----------------------------------");
        TransactionEntity transaction = new TransactionEntity();
        transaction.setTransactionId(12);
        transaction.setTransactionCardType("Mastercard");
        transaction.setTransactionAmount(123213.12);

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        TransactionDTO dto = mapper.map(transaction, TransactionDTO.class);
        System.out.println(dto);

    }
}
