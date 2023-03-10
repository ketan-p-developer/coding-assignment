/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.37).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.be.coding.assignment.demo.api;

import com.be.coding.assignment.demo.api.model.*;
import com.be.coding.assignment.demo.entities.Stock;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")
@Validated
public interface StocksApi {

    @Operation(summary = "Bulk upload thru file", description = "Function to upload bulk stock data thru file.  ", tags={ "multipart/form-data" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "File sucessfully recieved.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid File or unparsable file") })
    @RequestMapping(value = "/stocks/add/bulk/file",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> addStocksInBulk(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="fileType", required=false)  String fileType, @Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile documentFile);


    @Operation(summary = "Bulk upload thru file from SAN location", description = "Function to upload bulk stock data thru file which is stored in SAN storage (This is not implemented in this assignment for simplicity). This would be the performance optimised way.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "File found at location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid File or unparsable file", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/stocks/add/bulk/location",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> addStocksInBulkFromSan(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody BulkLocationBody body);


    @Operation(summary = "Add a single stock data set", description = "Add a single data set to stock data application", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Error Response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/stocks/add/single",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addStocksSingle(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody AddSingleBody body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "an array of data elements", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Stockdata.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Stock Ticker supplied"),
        
        @ApiResponse(responseCode = "404", description = "Stock Ticker with this Symbol not found") })
    @RequestMapping(value = "/stocks/{ticker}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Stock>> getStockDataByTicker(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("ticker") String ticker);

}

