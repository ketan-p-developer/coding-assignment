package com.be.coding.assignment.demo.api;

import com.be.coding.assignment.demo.api.model.*;
import com.be.coding.assignment.demo.entities.Stock;
import com.be.coding.assignment.demo.repositories.StockRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")
@RestController
public class StocksApiController implements StocksApi {

    @Autowired
    StockRepository stRepo;

    private static final Logger log = LoggerFactory.getLogger(StocksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Value("${stockFile-inputPath}")
    private String fileIpPath;

    public static final String input="/input.csv";

    @org.springframework.beans.factory.annotation.Autowired
    public StocksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> addStocksInBulk(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="fileType", required=false)  String fileType,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile documentFile) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                InputStream in = documentFile.getInputStream();
                File dest = new File(fileIpPath+input);
                documentFile.transferTo(dest);


                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> addStocksInBulkFromSan(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody BulkLocationBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addStocksSingle(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody AddSingleBody body) {
        String accept = request.getHeader("Accept");
        @Valid Stock s = body.getStockDataElement();
        //TODO validate stock data
        stRepo.save(s);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Stock>> getStockDataByTicker(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("ticker") String ticker) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List l1 = stRepo.findByTicker(ticker);
            return new ResponseEntity<List<Stock>>(l1, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<List<Stock>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
