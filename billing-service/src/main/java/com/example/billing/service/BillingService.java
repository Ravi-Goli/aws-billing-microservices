package com.example.billing.service;

import com.example.billing.model.Invoice;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillingService {
    private List<Invoice> invoices = new ArrayList<>();

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public Invoice createInvoice(Invoice invoice) {
        invoices.add(invoice);
        return invoice;
    }
}