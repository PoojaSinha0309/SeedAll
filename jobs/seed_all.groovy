job('Seed All') {
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      //removeAction('DELETE')
    }
  }
}