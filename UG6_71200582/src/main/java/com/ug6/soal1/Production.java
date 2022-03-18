package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.format.FormatStyle;

public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private double costCalculation = 0.0D;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate) {
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays();
    }

    public boolean checkPhonesSpecification(String androidCode) {
        int index = 0;
        boolean status = false;

        Iterator<String> variabel1;
        for(variabel1 = Codes.ANDROIDCODES.iterator(); variabel1.hasNext(); ++index) {
            String androidLevel = variabel1.next();
            status = !androidCode.equalsIgnoreCase(androidLevel) || index >= 3;
        }

        return status;
    }

    public boolean checkPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + false);

        Iterator<String> variabel;
        for(variabel = Codes.ANDROIDCODES.iterator(); variabel.hasNext(); ++index) {
            String androidLevel = variabel.next();
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    status = true;
                }
            } else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
        }

        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(Phones phone) {
        long productionDuration = (long)this.getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);
        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + todayFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if (productionRate >= 0.0F && productionRate <= 2.0F) {
            long productionDuration = (long)((float)((long)this.getProductionCapacity() * 3L) * productionRate);
            LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            today.format(DateTimeFormatter.ISO_LOCAL_DATE);
            productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction * 2.0D;
            this.setCostCalculation(cost);
            String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusProductionDate);
            System.out.println("Production Due date: " + bonusProductionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        } else {
            System.out.println("Please Input valid Production Rate");
        }

    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }

    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }



    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }

    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }

    public void setProductionDueDays() {
    }

    public double getCostCalculation() {
        return this.costCalculation;
    }




}