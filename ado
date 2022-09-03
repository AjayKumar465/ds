int[][]  twodArr = [1,2],[4,3],[]

int col = 2,
int row = 2;

for(int i =0;i<row;i++){
  for(int j =0; j<col;j++ ){
      int temp = twodArr[i][j];
      twodArr[i][j] = twodArr[i+1][j+1]
  }
}
a -> b
b -> twodArr

Mock

when(mockObject.youMethod(Mock.is)).thenReturn(df)

verrif(moc,).method();

@ReuqestMappng("api/v1/employee")
EmployeeController{
 
    @PostMapping("/save", produces, consumes)
    saveEmployee(@RequestBody EmployeeDTO)

    GetMapping("/getEmployeeById/{id}")
    getEmployeeByIda(@PathVariable Integer id)

   @PutMapping("/update", produces, consumes)
    updateEmployee(@RB EmployeeDTO)

    @DeleteMapping("/deleteEmployeeById/{id}")
    deleteEmloyeeById(@PathVariable Integer id)

}