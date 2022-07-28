package OOP.chapter2.Initialization;

public class MemberDefinition {
    int counter;

    //double totalPercentage = counter * percentage;  //COMPILE ERROR(forward reference)
    //double percentage = 5.8;

    double totalPercentage = counter * percentage;    //OK!
    static double percentage = 5.8;

    //'static' olan percentage, sınıf değişkeni olduğu için nesneye ihtiyaç duymadan initialize edilir.
    //Daha sonra nesne oluşturup, totalPercentage'i hesaplamak istediğimizde, percentage zaten init edildiği için hata çıkmayacaktır.
}
