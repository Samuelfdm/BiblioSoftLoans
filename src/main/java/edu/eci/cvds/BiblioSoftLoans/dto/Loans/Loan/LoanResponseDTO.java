package edu.eci.cvds.BiblioSoftLoans.dto.Loans.Loan;

import java.time.LocalDate;
import java.util.List;
import edu.eci.cvds.BiblioSoftLoans.model.LoanHistory;
import edu.eci.cvds.BiblioSoftLoans.model.LoanState;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class LoanResponseDTO {
    private Long loanId;
    private String copyId;
    private String bookId;
    private String studentId;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private LoanState loanState;
    private List<LoanHistory> loanHistory;

    public LoanResponseDTO(Long loanId, String copyId, String bookId, String studentId, LocalDate loanDate, LocalDate returnDate, LoanState loanState, List<LoanHistory> loanHistory) {
        this.loanId = loanId;
        this.copyId = copyId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.loanState = loanState;
        this.loanHistory = loanHistory;
    }
}