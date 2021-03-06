package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "loan_details")
public class LoanDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(sequenceName = "loan_seq",initialValue = 10000,name = "loan_seq")
	@Column(name = "loan_id")
	private long loanId;
	
	@Column(name = "loan_type")
	@Enumerated(EnumType.STRING)
	@NotNull
	private type loanType;
	
	@Column(name = "interest_rate")
	private int interestRate;
	
	@Column(name = "loan_amonut")
	@Min(value = 1000,message = "Minimum amount must be 1000 INR")
	@Max(value = 4000000,message = "Minimun amount can not exceed 4000000 INR")
	@NotNull
	private long loanAmount;
	
	@Column(name = "duration")
	@Min(value = 6,message = "Minimum duration must be 6 months.")
	@Max(value = 120,message = "Maximum duration can not exceed 120 months")
	@NotNull
	private double duration;
	
	@Column(name = "loan_status")
	@Enumerated(EnumType.STRING)
	@NotNull
	private status loanStatus;
	
	@Column(name = "emi")
	private double emi;
	
	@Column(name = "account_number")
	@NotNull
	private String accountNumber;
	
	@Column(name = "varification_file")
	@NotNull
	private String varificationFile;
	
	public enum status
	{
		approved,rejected,pending
	};
	private enum type
	{
		education,home,personal
	}
	
	public LoanDetails(@NotNull type loanType, int interestRate,
			@Min(value = 1000) @Max(value = 4000000) @NotNull long loanAmount,
			@Min(value = 6) @Max(value = 120) @NotNull @Min(value = 6) @Max(value = 120) @NotNull double duration,
			@NotNull status loanStatus, @NotNull String accoutnNumber, @NotNull String varificationFile)
	{
		super();
		this.loanType = loanType;
		this.interestRate = interestRate;
		this.loanAmount = loanAmount;
		this.duration = duration;
		this.loanStatus = loanStatus;
		this.accountNumber = accoutnNumber;
		this.varificationFile = varificationFile;
	}
	
}
