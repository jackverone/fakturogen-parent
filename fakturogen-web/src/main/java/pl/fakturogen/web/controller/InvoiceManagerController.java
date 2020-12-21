package pl.fakturogen.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fakturogen.invoice.model.InvoiceModel;
import pl.fakturogen.invoice.service.InvoiceService;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceManagerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceManagerController.class);

    private InvoiceService invoiceService;

    public InvoiceManagerController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceModel> read(@PathVariable Long id) {
        LOGGER.info("read({})", id);
        return ResponseEntity.ok(invoiceService.read(id));
    }
}
