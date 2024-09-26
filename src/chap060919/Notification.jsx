import React from "react";
import './styles.css'

class Notification extends React.Component{
    constructor(props) {
        super(props); //React/Component가 생성될 때, props를 전달받을 수 있는 매개변수를 갖는 생성자가 호출

        this.state = {
            //변수.값
        };
    }

    componentDidMount() {
        console.log(`${this.props.id} : componentDidMount() called`);
    }
    componentDidUpdate() {
        console.log(`${this.props.id} : componentDidUpdate() called`);
    }
    componentWillUnmount() {
        console.log(`${this.props.id} : componentWillUnmount() called`);
    }

    render(){
        return (
            <div className='wrapper'>
                <span className = 'messageText'>
                    {this.props.message}
                </span>
            </div>
        );
    }
}

export default Notification