public class InputNoNullForCollectionReturnCheck8
{
	public List<MatchResult> getMatches(int columnIndex, int rowIndex) {
		ListResult<Company> result = coreAppService.findCompanies(cell.getTextValue(),
				searchParameters);
		return Lists.transform(result.getList(), new Function<Company, MatchResult>() {

			@Override
			public MatchResult apply(Company input) {
				MatchResult mr = new MatchResult();
				String title = (input.getTicker() != null) ? String.format("%s (%s)", input.getName(),
						input.getTicker()) : input.getName();
				return mr;
			}
		});
	}

}
