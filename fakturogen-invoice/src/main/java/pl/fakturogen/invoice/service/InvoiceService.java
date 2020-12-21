package pl.fakturogen.invoice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.fakturogen.invoice.model.InvoiceModel;

@Service
public class InvoiceService {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceService.class);

    public InvoiceModel read(Long id) {
        LOGGER.info("read({})", id);
        return new InvoiceModel();
    }
}
