package Programacao_Orientada_Objetos_PT2.Model.Services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
