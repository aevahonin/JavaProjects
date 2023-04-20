package hospital;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] = Math.round(((float) (Math.random() * 8) + 32) * 100) / (float) 100.0;
        }
        return patientsTemperature;
    }
    public static String getReport(float[] temperatureData) {
        float allTemp = 0.0F;
        int countOfPatients = 0;
        int recoveredCount = 0;
        for(int i = 0; i < temperatureData.length; i++){
            if (temperatureData[i] > 36.1 && temperatureData[i] < 37.0) {
                recoveredCount++;
            }
            countOfPatients ++;
            allTemp += temperatureData[i];
        }
        float avgTemp = allTemp / countOfPatients;
        String formattedAvgTemp = new DecimalFormat("#0.00").format(avgTemp);
        String str = Arrays.toString(temperatureData);
        String report =
                "Температуры пациентов: " + str.replaceAll("\\[","").replaceAll(",","").replaceAll("\\]","") +
                        "\nСредняя температура: " + formattedAvgTemp +
                        "\nКоличество здоровых: " + recoveredCount;
        return report;
    }
}
